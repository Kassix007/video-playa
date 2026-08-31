.class public final Ly4/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ly4/m;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static a(I)Ly4/l;
    .locals 1

    .line 1
    new-instance v0, Ly4/l;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p0, v0, Ly4/l;->a:I

    .line 7
    .line 8
    iget-byte p0, v0, Ly4/l;->b:B

    .line 9
    .line 10
    or-int/lit8 p0, p0, 0x1

    .line 11
    .line 12
    int-to-byte p0, p0

    .line 13
    or-int/lit8 p0, p0, 0x2

    .line 14
    .line 15
    int-to-byte p0, p0

    .line 16
    iput-byte p0, v0, Ly4/l;->b:B

    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ly4/m;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Ly4/m;

    .line 10
    .line 11
    iget v1, p0, Ly4/m;->a:I

    .line 12
    .line 13
    iget p1, p1, Ly4/m;->a:I

    .line 14
    .line 15
    if-ne v1, p1, :cond_1

    .line 16
    .line 17
    return v0

    .line 18
    :cond_1
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Ly4/m;->a:I

    .line 2
    .line 3
    const v1, 0xf4243

    .line 4
    .line 5
    .line 6
    xor-int/2addr v0, v1

    .line 7
    mul-int/2addr v0, v1

    .line 8
    xor-int/lit16 v0, v0, 0x4d5

    .line 9
    .line 10
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "AppUpdateOptions{appUpdateType="

    .line 2
    .line 3
    const-string v1, ", allowAssetPackDeletion=false}"

    .line 4
    .line 5
    iget v2, p0, Ly4/m;->a:I

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LC0/S;->m(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
