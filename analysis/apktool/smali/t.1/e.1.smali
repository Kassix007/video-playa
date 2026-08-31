.class public final Lt/e;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# static fields
.field public static final q:Lt/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lt/e;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lt/e;->q:Lt/e;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, LW0/k;

    .line 2
    .line 3
    iget-wide v0, p1, LW0/k;->a:J

    .line 4
    .line 5
    check-cast p2, LW0/k;

    .line 6
    .line 7
    iget-wide p1, p2, LW0/k;->a:J

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    int-to-long v0, p1

    .line 11
    const/16 p2, 0x20

    .line 12
    .line 13
    shl-long v2, v0, p2

    .line 14
    .line 15
    const-wide v4, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr v0, v4

    .line 21
    or-long/2addr v0, v2

    .line 22
    new-instance p2, LW0/k;

    .line 23
    .line 24
    invoke-direct {p2, v0, v1}, LW0/k;-><init>(J)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, p2}, Lu/d;->o(ILjava/lang/Object;)Lu/f0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method
