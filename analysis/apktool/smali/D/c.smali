.class public final LD/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LB0/j0;

.field public b:J

.field public c:F

.field public d:LD/r;


# direct methods
.method public constructor <init>(LB0/j0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD/c;->a:LB0/j0;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    const/16 v0, 0xf

    .line 8
    .line 9
    invoke-static {p1, p1, v0}, LW0/b;->b(III)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, LD/c;->b:J

    .line 14
    .line 15
    return-void
.end method
