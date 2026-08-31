.class public final Lcom/google/android/gms/internal/vision/a1;
.super Ly3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/vision/a1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public q:I

.field public r:I

.field public s:I

.field public t:J

.field public u:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/vision/b1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/vision/a1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    .line 1
    const/16 p2, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/n2;->Y(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    iget v0, p0, Lcom/google/android/gms/internal/vision/a1;->q:I

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x4

    .line 11
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/measurement/n2;->b0(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget v0, p0, Lcom/google/android/gms/internal/vision/a1;->r:I

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/measurement/n2;->b0(Landroid/os/Parcel;II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget v0, p0, Lcom/google/android/gms/internal/vision/a1;->s:I

    .line 27
    .line 28
    invoke-static {p1, v2, v2}, Lcom/google/android/gms/internal/measurement/n2;->b0(Landroid/os/Parcel;II)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 32
    .line 33
    .line 34
    iget-wide v0, p0, Lcom/google/android/gms/internal/vision/a1;->t:J

    .line 35
    .line 36
    const/16 v3, 0x8

    .line 37
    .line 38
    const/4 v4, 0x5

    .line 39
    invoke-static {p1, v4, v3}, Lcom/google/android/gms/internal/measurement/n2;->b0(Landroid/os/Parcel;II)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 43
    .line 44
    .line 45
    iget v0, p0, Lcom/google/android/gms/internal/vision/a1;->u:I

    .line 46
    .line 47
    const/4 v1, 0x6

    .line 48
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/measurement/n2;->b0(Landroid/os/Parcel;II)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/n2;->a0(Landroid/os/Parcel;I)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
