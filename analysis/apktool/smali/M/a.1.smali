.class public final LM/a;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:F

.field public final synthetic r:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    .line 1
    iput p1, p0, LM/a;->q:F

    .line 2
    .line 3
    iput p2, p0, LM/a;->r:F

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, LP/o;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 p2, p2, 0x3

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    if-ne p2, v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, LP/o;->x()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p1}, LP/o;->N()V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    iget p2, p0, LM/a;->q:F

    .line 26
    .line 27
    iget v0, p0, LM/a;->r:F

    .line 28
    .line 29
    sget-object v1, Lc0/j;->q:Lc0/j;

    .line 30
    .line 31
    invoke-static {v1, p2, v0}, Landroidx/compose/foundation/layout/c;->d(Lc0/m;FF)Lc0/m;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-static {p2, p1, v0}, LA/n;->a(Lc0/m;LP/o;I)V

    .line 37
    .line 38
    .line 39
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 40
    .line 41
    return-object p1
.end method
