.class public final synthetic La5/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Ljava/util/List;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:La5/y;

.field public final synthetic u:I

.field public final synthetic v:Lcom/web2native/MainActivity;

.field public final synthetic w:Lcom/web2native/MainActivity;

.field public final synthetic x:LB5/c;

.field public final synthetic y:LB5/a;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;La5/y;ILcom/web2native/MainActivity;Lcom/web2native/MainActivity;LB5/c;LB5/a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/q;->q:Ljava/util/List;

    iput-object p2, p0, La5/q;->r:Ljava/lang/String;

    iput-object p3, p0, La5/q;->s:Ljava/lang/String;

    iput-object p4, p0, La5/q;->t:La5/y;

    iput p5, p0, La5/q;->u:I

    iput-object p6, p0, La5/q;->v:Lcom/web2native/MainActivity;

    iput-object p7, p0, La5/q;->w:Lcom/web2native/MainActivity;

    iput-object p8, p0, La5/q;->x:LB5/c;

    iput-object p9, p0, La5/q;->y:LB5/a;

    iput p10, p0, La5/q;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La5/q;->z:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, LP/b;->w(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget-object v0, p0, La5/q;->q:Ljava/util/List;

    .line 18
    .line 19
    iget-object v1, p0, La5/q;->r:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, La5/q;->s:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v3, p0, La5/q;->t:La5/y;

    .line 24
    .line 25
    iget v4, p0, La5/q;->u:I

    .line 26
    .line 27
    iget-object v5, p0, La5/q;->v:Lcom/web2native/MainActivity;

    .line 28
    .line 29
    iget-object v6, p0, La5/q;->w:Lcom/web2native/MainActivity;

    .line 30
    .line 31
    iget-object v7, p0, La5/q;->x:LB5/c;

    .line 32
    .line 33
    iget-object v8, p0, La5/q;->y:LB5/a;

    .line 34
    .line 35
    invoke-static/range {v0 .. v10}, LC3/a;->k(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;La5/y;ILcom/web2native/MainActivity;Lcom/web2native/MainActivity;LB5/c;LB5/a;LP/o;I)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 39
    .line 40
    return-object p1
.end method
