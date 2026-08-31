.class public final LA0/i;
.super Lcom/google/android/gms/internal/measurement/I1;
.source "SourceFile"


# instance fields
.field public final c:LA0/h;

.field public final d:LP/f0;


# direct methods
.method public constructor <init>(LA0/h;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/I1;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, LA0/i;->c:LA0/h;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, LA0/i;->d:LP/f0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final O(LA0/h;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LA0/i;->c:LA0/h;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    return p1
.end method

.method public final X(LA0/h;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LA0/i;->c:LA0/h;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p1, "Check failed."

    .line 7
    .line 8
    invoke-static {p1}, Ly0/a;->b(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :goto_0
    iget-object p1, p0, LA0/i;->d:LP/f0;

    .line 12
    .line 13
    invoke-virtual {p1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    :cond_1
    return-object p1
.end method
