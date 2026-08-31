.class public final LP/E0;
.super La0/w;
.source "SourceFile"


# instance fields
.field public c:F


# direct methods
.method public constructor <init>(JF)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, La0/w;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LP/E0;->c:F

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La0/w;)V
    .locals 1

    .line 1
    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, LP/E0;

    .line 7
    .line 8
    iget p1, p1, LP/E0;->c:F

    .line 9
    .line 10
    iput p1, p0, LP/E0;->c:F

    .line 11
    .line 12
    return-void
.end method

.method public final b(J)La0/w;
    .locals 2

    .line 1
    new-instance v0, LP/E0;

    .line 2
    .line 3
    iget v1, p0, LP/E0;->c:F

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, v1}, LP/E0;-><init>(JF)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
