.class public final LE/K;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lkotlin/jvm/internal/n;

.field public final b:LE/c0;

.field public c:LB0/G0;


# direct methods
.method public constructor <init>(LB5/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    check-cast p1, Lkotlin/jvm/internal/n;

    .line 5
    .line 6
    iput-object p1, p0, LE/K;->a:Lkotlin/jvm/internal/n;

    .line 7
    .line 8
    new-instance p1, LE/c0;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {p1, v0}, LE/c0;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LE/K;->b:LE/c0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(IJ)LE/J;
    .locals 6

    .line 1
    iget-object v1, p0, LE/K;->c:LB0/G0;

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    new-instance v0, LE/b0;

    .line 6
    .line 7
    iget-object v5, p0, LE/K;->b:LE/c0;

    .line 8
    .line 9
    move v2, p1

    .line 10
    move-wide v3, p2

    .line 11
    invoke-direct/range {v0 .. v5}, LE/b0;-><init>(LB0/G0;IJLE/c0;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, v1, LB0/G0;->t:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, LE/d0;

    .line 17
    .line 18
    invoke-interface {p1, v0}, LE/d0;->a(LE/b0;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    sget-object p1, LE/h;->a:LE/h;

    .line 23
    .line 24
    return-object p1
.end method
