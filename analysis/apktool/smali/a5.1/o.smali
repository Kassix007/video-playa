.class public final synthetic La5/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Lcom/web2native/MainActivity;

.field public final synthetic r:I

.field public final synthetic s:Lcom/web2native/MainActivity;

.field public final synthetic t:I

.field public final synthetic u:La5/y;

.field public final synthetic v:LB5/c;


# direct methods
.method public synthetic constructor <init>(Lcom/web2native/MainActivity;ILcom/web2native/MainActivity;ILa5/y;LB5/c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/o;->q:Lcom/web2native/MainActivity;

    iput p2, p0, La5/o;->r:I

    iput-object p3, p0, La5/o;->s:Lcom/web2native/MainActivity;

    iput p4, p0, La5/o;->t:I

    iput-object p5, p0, La5/o;->u:La5/y;

    iput-object p6, p0, La5/o;->v:LB5/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const p1, 0x8001

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, LP/b;->w(I)I

    .line 13
    .line 14
    .line 15
    move-result v7

    .line 16
    iget-object v0, p0, La5/o;->q:Lcom/web2native/MainActivity;

    .line 17
    .line 18
    iget v1, p0, La5/o;->r:I

    .line 19
    .line 20
    iget-object v2, p0, La5/o;->s:Lcom/web2native/MainActivity;

    .line 21
    .line 22
    iget v3, p0, La5/o;->t:I

    .line 23
    .line 24
    iget-object v4, p0, La5/o;->u:La5/y;

    .line 25
    .line 26
    iget-object v5, p0, La5/o;->v:LB5/c;

    .line 27
    .line 28
    invoke-static/range {v0 .. v7}, LC3/a;->j(Lcom/web2native/MainActivity;ILcom/web2native/MainActivity;ILa5/y;LB5/c;LP/o;I)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 32
    .line 33
    return-object p1
.end method
