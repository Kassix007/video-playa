.class public final Landroidx/compose/foundation/b;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public final synthetic q:Lv/P;

.field public final synthetic r:Z

.field public final synthetic s:LI0/f;

.field public final synthetic t:LB5/a;


# direct methods
.method public constructor <init>(Lv/P;ZLI0/f;LB5/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/b;->q:Lv/P;

    .line 2
    .line 3
    iput-boolean p2, p0, Landroidx/compose/foundation/b;->r:Z

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/b;->s:LI0/f;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/foundation/b;->t:LB5/a;

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lc0/m;

    .line 2
    .line 3
    check-cast p2, LP/o;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    const p1, -0x5af0b3b9

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, p1}, LP/o;->S(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p3, LP/k;->a:LP/S;

    .line 21
    .line 22
    if-ne p1, p3, :cond_0

    .line 23
    .line 24
    new-instance p1, Ly/i;

    .line 25
    .line 26
    invoke-direct {p1}, Ly/i;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    move-object v1, p1

    .line 33
    check-cast v1, Ly/i;

    .line 34
    .line 35
    iget-object p1, p0, Landroidx/compose/foundation/b;->q:Lv/P;

    .line 36
    .line 37
    invoke-static {v1, p1}, Landroidx/compose/foundation/c;->a(Ly/i;Lv/P;)Lc0/m;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance v0, Landroidx/compose/foundation/ClickableElement;

    .line 42
    .line 43
    iget-object v4, p0, Landroidx/compose/foundation/b;->s:LI0/f;

    .line 44
    .line 45
    iget-object v5, p0, Landroidx/compose/foundation/b;->t:LB5/a;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    iget-boolean v3, p0, Landroidx/compose/foundation/b;->r:Z

    .line 49
    .line 50
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/ClickableElement;-><init>(Ly/i;Lv/V;ZLI0/f;LB5/a;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/4 p3, 0x0

    .line 58
    invoke-virtual {p2, p3}, LP/o;->p(Z)V

    .line 59
    .line 60
    .line 61
    return-object p1
.end method
