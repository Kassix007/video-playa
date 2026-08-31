.class public final Lu/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/S0;


# instance fields
.field public q:Ljava/lang/Number;

.field public r:Ljava/lang/Number;

.field public final s:LZ/m;

.field public final t:LP/f0;

.field public u:Lu/n0;

.field public v:Z

.field public w:Z

.field public x:J

.field public final synthetic y:Lu/H;


# direct methods
.method public constructor <init>(Lu/H;Ljava/lang/Number;Ljava/lang/Number;LZ/m;Lu/D;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu/E;->y:Lu/H;

    .line 5
    .line 6
    iput-object p2, p0, Lu/E;->q:Ljava/lang/Number;

    .line 7
    .line 8
    iput-object p3, p0, Lu/E;->r:Ljava/lang/Number;

    .line 9
    .line 10
    iput-object p4, p0, Lu/E;->s:LZ/m;

    .line 11
    .line 12
    invoke-static {p2}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lu/E;->t:LP/f0;

    .line 17
    .line 18
    new-instance v0, Lu/n0;

    .line 19
    .line 20
    iget-object v3, p0, Lu/E;->q:Ljava/lang/Number;

    .line 21
    .line 22
    iget-object v4, p0, Lu/E;->r:Ljava/lang/Number;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    move-object v2, p4

    .line 26
    move-object v1, p5

    .line 27
    invoke-direct/range {v0 .. v5}, Lu/n0;-><init>(Lu/k;LZ/m;Ljava/lang/Object;Ljava/lang/Object;Lu/q;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lu/E;->u:Lu/n0;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu/E;->t:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
