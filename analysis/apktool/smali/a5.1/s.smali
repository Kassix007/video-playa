.class public final synthetic La5/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:La5/c;

.field public final synthetic t:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;La5/c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/s;->q:Ljava/lang/String;

    iput-object p2, p0, La5/s;->r:Ljava/lang/String;

    iput-object p3, p0, La5/s;->s:La5/c;

    iput p4, p0, La5/s;->t:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, LP/o;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget p2, p0, La5/s;->t:I

    .line 9
    .line 10
    or-int/lit8 p2, p2, 0x1

    .line 11
    .line 12
    invoke-static {p2}, LP/b;->w(I)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iget-object v0, p0, La5/s;->q:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v1, p0, La5/s;->r:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v2, p0, La5/s;->s:La5/c;

    .line 21
    .line 22
    invoke-static {v0, v1, v2, p1, p2}, LC3/a;->g(Ljava/lang/String;Ljava/lang/String;La5/c;LP/o;I)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 26
    .line 27
    return-object p1
.end method
