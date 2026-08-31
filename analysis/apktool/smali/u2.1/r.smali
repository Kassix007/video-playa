.class public final Lu2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE2/i;
.implements Lz0/o;


# instance fields
.field public final q:LP5/S;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-wide v0, Lu2/w;->a:J

    .line 5
    .line 6
    new-instance v2, LW0/a;

    .line 7
    .line 8
    invoke-direct {v2, v0, v1}, LW0/a;-><init>(J)V

    .line 9
    .line 10
    .line 11
    invoke-static {v2}, LP5/H;->b(Ljava/lang/Object;)LP5/S;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lu2/r;->q:LP5/S;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final c(LB0/T;Lz0/B;J)Lz0/D;
    .locals 3

    .line 1
    new-instance v0, LW0/a;

    .line 2
    .line 3
    invoke-direct {v0, p3, p4}, LW0/a;-><init>(J)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lu2/r;->q:LP5/S;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v1, v2, v0}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, p3, p4}, Lz0/B;->a(J)Lz0/J;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iget p3, p2, Lz0/J;->q:I

    .line 20
    .line 21
    iget p4, p2, Lz0/J;->r:I

    .line 22
    .line 23
    new-instance v0, Lu2/p;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p2, v1}, Lu2/p;-><init>(Lz0/J;I)V

    .line 27
    .line 28
    .line 29
    sget-object p2, Ln5/t;->q:Ln5/t;

    .line 30
    .line 31
    invoke-interface {p1, p3, p4, p2, v0}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method public final f(Lt2/j;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lu2/m;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lu2/r;->q:LP5/S;

    .line 5
    .line 6
    invoke-direct {v0, v2, v1}, Lu2/m;-><init>(LP5/S;I)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p1}, LP5/H;->j(LP5/h;Ls5/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
