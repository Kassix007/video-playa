.class public final Lcom/google/android/gms/common/api/Status;
.super Ly3/a;
.source "SourceFile"

# interfaces
.implements Lu3/h;
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end field

.field public static final u:Lcom/google/android/gms/common/api/Status;

.field public static final v:Lcom/google/android/gms/common/api/Status;

.field public static final w:Lcom/google/android/gms/common/api/Status;


# instance fields
.field public final q:I

.field public final r:Ljava/lang/String;

.field public final s:Landroid/app/PendingIntent;

.field public final t:Lcom/google/android/gms/common/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2, v2, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/b;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/google/android/gms/common/api/Status;->u:Lcom/google/android/gms/common/api/Status;

    .line 9
    .line 10
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 11
    .line 12
    const/16 v1, 0xf

    .line 13
    .line 14
    invoke-direct {v0, v1, v2, v2, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/b;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/google/android/gms/common/api/Status;->v:Lcom/google/android/gms/common/api/Status;

    .line 18
    .line 19
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 20
    .line 21
    const/16 v1, 0x10

    .line 22
    .line 23
    invoke-direct {v0, v1, v2, v2, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/b;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/google/android/gms/common/api/Status;->w:Lcom/google/android/gms/common/api/Status;

    .line 27
    .line 28
    new-instance v0, Lcom/google/android/material/datepicker/p;

    .line 29
    .line 30
    invoke-direct {v0, v1}, Lcom/google/android/material/datepicker/p;-><init>(I)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/gms/common/api/Status;->q:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/common/api/Status;->r:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/common/api/Status;->s:Landroid/app/PendingIntent;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/common/api/Status;->t:Lcom/google/android/gms/common/b;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final W()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/Status;->r:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget v0, p0, Lcom/google/android/gms/common/api/Status;->q:I

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    :pswitch_0
    const-string v1, "unknown status code: "

    .line 12
    .line 13
    invoke-static {v0, v1}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :pswitch_1
    const-string v0, "RECONNECTION_TIMED_OUT"

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_2
    const-string v0, "RECONNECTION_TIMED_OUT_DURING_UPDATE"

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_3
    const-string v0, "CONNECTION_SUSPENDED_DURING_CALL"

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_4
    const-string v0, "REMOTE_EXCEPTION"

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_5
    const-string v0, "DEAD_CLIENT"

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_6
    const-string v0, "API_NOT_CONNECTED"

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_7
    const-string v0, "CANCELED"

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_8
    const-string v0, "TIMEOUT"

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_9
    const-string v0, "INTERRUPTED"

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_a
    const-string v0, "ERROR"

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_b
    const-string v0, "DEVELOPER_ERROR"

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_c
    const-string v0, "INTERNAL_ERROR"

    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_d
    const-string v0, "NETWORK_ERROR"

    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_e
    const-string v0, "RESOLUTION_REQUIRED"

    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_f
    const-string v0, "INVALID_ACCOUNT"

    .line 61
    .line 62
    return-object v0

    .line 63
    :pswitch_10
    const-string v0, "SIGN_IN_REQUIRED"

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_11
    const-string v0, "SERVICE_DISABLED"

    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_12
    const-string v0, "SERVICE_VERSION_UPDATE_REQUIRED"

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_13
    const-string v0, "SUCCESS"

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_14
    const-string v0, "SUCCESS_CACHE"

    .line 76
    .line 77
    return-object v0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_14
        :pswitch_13
        :pswitch_0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_0
        :pswitch_b
        :pswitch_0
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 8
    .line 9
    iget v0, p0, Lcom/google/android/gms/common/api/Status;->q:I

    .line 10
    .line 11
    iget v2, p1, Lcom/google/android/gms/common/api/Status;->q:I

    .line 12
    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/common/api/Status;->r:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v2, p1, Lcom/google/android/gms/common/api/Status;->r:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0, v2}, Lx3/A;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lcom/google/android/gms/common/api/Status;->s:Landroid/app/PendingIntent;

    .line 26
    .line 27
    iget-object v2, p1, Lcom/google/android/gms/common/api/Status;->s:Landroid/app/PendingIntent;

    .line 28
    .line 29
    invoke-static {v0, v2}, Lx3/A;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, Lcom/google/android/gms/common/api/Status;->t:Lcom/google/android/gms/common/b;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/google/android/gms/common/api/Status;->t:Lcom/google/android/gms/common/b;

    .line 38
    .line 39
    invoke-static {v0, p1}, Lx3/A;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    return p1

    .line 47
    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/gms/common/api/Status;->q:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/google/android/gms/common/api/Status;->s:Landroid/app/PendingIntent;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/android/gms/common/api/Status;->t:Lcom/google/android/gms/common/b;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/google/android/gms/common/api/Status;->r:Ljava/lang/String;

    .line 12
    .line 13
    filled-new-array {v0, v3, v1, v2}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lv3/l;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lv3/l;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "statusCode"

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->W()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v2, v1}, Lv3/l;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "resolution"

    .line 16
    .line 17
    iget-object v2, p0, Lcom/google/android/gms/common/api/Status;->s:Landroid/app/PendingIntent;

    .line 18
    .line 19
    invoke-virtual {v0, v2, v1}, Lv3/l;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lv3/l;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/n2;->Y(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x4

    .line 9
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/measurement/n2;->b0(Landroid/os/Parcel;II)V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lcom/google/android/gms/common/api/Status;->q:I

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    iget-object v3, p0, Lcom/google/android/gms/common/api/Status;->r:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1, v1, v3}, Lcom/google/android/gms/internal/measurement/n2;->V(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x3

    .line 24
    iget-object v3, p0, Lcom/google/android/gms/common/api/Status;->s:Landroid/app/PendingIntent;

    .line 25
    .line 26
    invoke-static {p1, v1, v3, p2}, Lcom/google/android/gms/internal/measurement/n2;->U(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/google/android/gms/common/api/Status;->t:Lcom/google/android/gms/common/b;

    .line 30
    .line 31
    invoke-static {p1, v2, v1, p2}, Lcom/google/android/gms/internal/measurement/n2;->U(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/n2;->a0(Landroid/os/Parcel;I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final z()Lcom/google/android/gms/common/api/Status;
    .locals 0

    .line 1
    return-object p0
.end method
