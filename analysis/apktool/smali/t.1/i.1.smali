.class public final Lt/i;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:Lt/k;

.field public final synthetic r:Lz0/J;

.field public final synthetic s:J


# direct methods
.method public constructor <init>(Lt/k;Lz0/J;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt/i;->q:Lt/k;

    .line 2
    .line 3
    iput-object p2, p0, Lt/i;->r:Lz0/J;

    .line 4
    .line 5
    iput-wide p3, p0, Lt/i;->s:J

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Lz0/I;

    .line 2
    .line 3
    iget-object v0, p0, Lt/i;->q:Lt/k;

    .line 4
    .line 5
    iget-object v0, v0, Lt/k;->G:Lt/l;

    .line 6
    .line 7
    iget-object v1, v0, Lt/l;->b:Lc0/e;

    .line 8
    .line 9
    iget-object v0, p0, Lt/i;->r:Lz0/J;

    .line 10
    .line 11
    iget v2, v0, Lz0/J;->q:I

    .line 12
    .line 13
    iget v3, v0, Lz0/J;->r:I

    .line 14
    .line 15
    int-to-long v4, v2

    .line 16
    const/16 v2, 0x20

    .line 17
    .line 18
    shl-long/2addr v4, v2

    .line 19
    int-to-long v2, v3

    .line 20
    const-wide v6, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v2, v6

    .line 26
    or-long/2addr v2, v4

    .line 27
    sget-object v6, LW0/l;->q:LW0/l;

    .line 28
    .line 29
    iget-wide v4, p0, Lt/i;->s:J

    .line 30
    .line 31
    invoke-virtual/range {v1 .. v6}, Lc0/e;->a(JJLW0/l;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    invoke-static {p1, v0, v1, v2}, Lz0/I;->e(Lz0/I;Lz0/J;J)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 39
    .line 40
    return-object p1
.end method
